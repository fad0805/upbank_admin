import axios from "axios"

export default {
    namespaced: true,
    state: {
        noticeDetail : {}
    },
    mutations: {
        setProductDetail(state, payload) {
            state.noticeDetail = payload
        },
        clearProductDetail(state) {
            state.noticeDetail.length = {}
        }
    },
    actions: {
        async fetchDetail({ state, commit }, payload) {
            console.log('dispatch 호출')
            commit('clearProductDetail')

            try {
                let response = await axios.get("http://localhost:8040/api/noticeDetail?n_no=" + payload, {}, {
                    headers: {
                        'Content-Type': 'application/json; charset=utf-8',
                    }
                })
                console.log('response 확인 : ', response)

                let temp = {}
                for(const [key, value] of Object.entries(response.data.detail)) {
                    temp[key] = value ?? ''
                }
                commit('setProductDetail', temp)

                console.log('state 확인 : ', state.noticeDetail)

            } catch(error) {
                console.log(error)
            }
        }
    }
}
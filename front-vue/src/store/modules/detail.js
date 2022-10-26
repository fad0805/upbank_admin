import axios from "axios"

export default {
    namespaced: true,
    state: {
        productDetail : {}
    },
    mutations: {
        setProductDetail(state, payload) {
            state.productDetail = payload
        },
        clearProductDetail(state) {
            state.productDetail.length = {}
        }
    },
    actions: {
        async fetchDetail({ state, commit }, payload) {
            console.log('dispatch 호출')
            commit('clearProductDetail')

            try {
                let response = await axios.get("http://localhost:8040/api/product_detail?loan_num=" + payload, {}, {
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

                console.log('state 확인 : ', state.productDetail)

            } catch(error) {
                console.log(error)
            }
        }
    }
}
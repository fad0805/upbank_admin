import axios from "axios"

export default {
    namespaced: true,
    state: {
        productList: []
    },
    mutations: {
        setProductList(state, payload) {
            state.productList.push(payload)
        },
        clearProductList(state) {
            state.productList.length = 0
        }
    },
    actions: {
        async fetchList({ state, commit }) {
            console.log('dispatch 호출')
            commit('clearProductList')

            try {
                let response = await axios.get('http://localhost:8040/api/loan_product', {}, {
                    headers: {
                        'Content-Type': 'application/json; charset=utf-8',
                    }
                })
                console.log('response 확인 : ', response)

                let temp = {}
                for(let newData of response.data) {
                    for(const[key, value] of Object.entries(newData)) {
                        temp[key] = value ?? ''
                    }
                    commit('setProductList', temp)
                    temp = {}
                }

                console.log('state 확인 : ', state.productList)

            } catch (error) {
                console.log(error)
            }
        }
    }
}
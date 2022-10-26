import axios from "axios"

export default {
    namespaced: true,
    state: {
        depositProductList: []
    },
    mutations: {
        setDepositProductList(state, payload) {
            state.depositProductList.push(payload)
        },
        clearDepositProductList(state) {
            state.depositProductList.length = 0
        }
    },
    actions: {
        async fetchList({ state, commit }) {
            console.log('dispatch 호출')
            commit('clearDepositProductList')

            try {
                let response = await axios.get('http://localhost:8040/api/deposit_product', {}, {
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
                    commit('setDepositProductList', temp)
                    temp = {}
                }

                console.log('state 확인 : ', state.depositProductList)

            } catch (error) {
                console.log(error)
            }
        }
    }
}
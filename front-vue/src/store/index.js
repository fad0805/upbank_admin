import { createStore } from 'vuex'

import listProduct from './modules/list.js'
import DepositProductList from './modules/depositProductList.js'
import productDetail from './modules/detail.js'
import noticeList from './modules/noticeList.js'
import noticeDetail from './modules/noticeDetail.js'


const modules = {
    listProduct,
    productDetail,
    DepositProductList,
    noticeList,
    noticeDetail,
}

export default createStore ({
    modules
})
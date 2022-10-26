// r-2. createRouter, createWebHistory함수를 vue-router에서 import
import { createRouter, createWebHistory } from 'vue-router'

import HW from '@/components/HelloWorld.vue'
import LoanProduct from '@/components/LoanProductList.vue'
import ProductDetail from '@/components/LoanProductDetail.vue'
import DepositProductList from '@/components/DepositProductList.vue'
import NoticeList from '@/components/NoticeList.vue'
import NoticeDetail from '@/components/NoticeDetail.vue'

const router = createRouter({
    // 뒤로가기용
    history: createWebHistory(),
    routes: [
        // route 페이지가 설정되는 곳
        // routes 객체에는 항상 path, name, component가 있어야하며
        // name, path를 동일하게 설정하면 안 됨(router가 꼬임)
        // child를 선언하고 하위 route를 구성 가능
        {
            path: '/',
            name: 'main',
            component: HW
        },
        {
            path: '/loan_product.lo',
            name: 'loan_product',
            component: LoanProduct
        },
        {
            path: '/loan_product_detail.lo',
            name: 'loan_product_detail',
            component: ProductDetail
        },
        {
            path: '/depositProductList.do',
            name: 'depositProductList',
            component: DepositProductList
        },
        {
            path: '/noticeList.ad',
            name: 'noticeList',
            component: NoticeList
        },
        {
            path: '/noticeDetail.ad',
            name: 'noticeDetail',
            component: NoticeDetail
        }
    ]
})

// 만들어진 router를 내보내고 main.js로 이동
export default router

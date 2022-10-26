<template>
    <div class="page-title">
        <div class="container clearfix">

            <div class="sixteen columns"> 
            <h1>대출</h1>
            </div>

        </div><!-- End Container -->
    </div><!-- End Page title -->

    <!-- Start main content -->
    <div class="container main-content clearfix">
    <!-- Start Sidebar Widgets -->
        <div class="five columns sidebar bottom-3">
            <!-- 사이드바 -->
            <Sidebar />
        </div><!-- End Sidebar Widgets -->

    <!-- Start Posts -->
        <div class="sixteen columns bottom-3">

        <!-- ==================== Single Post ==================== -->
            <div class="post single style-1">
                <h3 class="title bottom-1">상품 목록</h3><!-- Title Post -->
                <hr class="line bottom-3" />

                <div style="display:flex;" v-for="product in productList" v-bind:key="product.loan_num">
                    <div class="eight columns bottom-3" STYLE="MARGIN-LEFT: 34px;">
                        <h3 class="title bottom-2">{{ product.loan_name }}</h3>
                        <div class="eight columns bottom-3" style="margin: 0; width: 800;">
                            <p>{{ product.loan_summary }}</p>
                            <p>
                                <br>최고 
                                <span style="font-size: 30px; color:#1E82FF;">
                                    <strong v-if="product.loan_limit >= 100000000">{{ product.loan_limit/100000000 }}억</strong>
                                    <strong v-else-if="product.loan_limit >= 10000000">{{ product.loan_limit/10000000 }}천만</strong>
                                    <strong v-else-if="product.loan_limit >= 1000000">{{ product.loan_limit/1000000 }}백만</strong>
                                    <strong v-else-if="product.loan_limit >= 100000">{{ product.loan_limit/100000 }}만</strong>
                                </span>
                                원
                            </p>
                        </div>
                    </div>
                    <div style="display:flex; align-items:flex-end;">
                        <input type="button" class="button1 small color" value="상세보기" @click="moveDetail(product.loan_num)">
                        <input type="button" class="button1 small color" id="loan_join" value="수정하기" onclick="loan_join({{ product.loan_num }});">
                    </div>
                </div>
                <hr class="line bottom-3" />
            </div><!-- End post-content -->
        </div> 
    <!-- ==================== End Single Post  ==================== -->
    </div><!-- End container -->  

    <div class="clearfix"></div>
</template>

<script>
    import Sidebar from '../layouts/sidebar/sidebarIndex.vue'
    import { useRouter } from 'vue-router'
    import { useStore } from 'vuex'
    import { computed, onMounted } from 'vue'

    export default {
        name: 'loan_product',
        components: {
            Sidebar
        },
        setup() {
            const router = useRouter()
            const store  = useStore()

            const productList = computed(() => {
                return store.state.listProduct.productList
            })

            const moveDetail = (loan_num) => {
                router.push({
                    name: 'loan_product_detail',
                    query: {
                        loan_num: loan_num
                    }
                })
            }

            onMounted(async () => {
                await store.dispatch('listProduct/fetchList')
            })

            return {
                productList,
                moveDetail,
                onMounted
            }
        }
    }
</script>
<style>
    p {
        text-align: left;
    }
</style>

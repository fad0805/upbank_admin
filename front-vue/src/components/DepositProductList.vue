<template>
    <div class="page-title">
        <div class="container clearfix">

            <div class="sixteen columns"> 
            <h1>예금</h1>
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
                <h3 class="title bottom-1">예금 상품 목록</h3><!-- Title Post -->
                <hr class="line bottom-3" />
                <div style="display:flex;" v-for="DpProduct in DepositProductList" v-bind:key="DpProduct.y_name">
                    <div class="eight columns bottom-3" STYLE="MARGIN-LEFT: 34px;">
                    <!-- Title Post -->
                            <div class="eight columns bottom-3" STYLE="MARGIN-LEFT: 34px;">
                                <h3 class="title bottom-2">{{DpProduct.y_name}}</h3>
                                <div class="eight columns bottom-3" style="margin: 0;width: 800;">
                                    <p>{{DpProduct.y_summary}}</p>
                                    <br>최고 연 <strong><span style="font-size: 30px; color:#1E82FF;">{{DpProduct.rate}}</span></strong>
                                    <span style="font-size: 15px; color:grey;">({{DpProduct.y_max_date}}개월)</span>
                                    
                                </div>
                            </div>

                            <br>
                            <br>
                            <hr class="line bottom-3" />
                </div>
                </div>
            </div><!-- End post-content -->
        </div> 
    <!-- ==================== End Single Post  ==================== -->
    </div><!-- End container -->  

    <div class="clearfix"></div>
</template>

<script>
    import Sidebar from '../layouts/sidebar/depositSidebar.vue'
    import { useRouter } from 'vue-router'
    import { useStore } from 'vuex'
    import { computed, onMounted } from 'vue'

    export default {
        name: 'depositProductList',
        components: {
            Sidebar
        },
        setup() {
            const router = useRouter()
            const store  = useStore()

            const DepositProductList = computed(() => {
                return store.state.DepositProductList.depositProductList
            })

            const moveDetail = (y_name) => {
                router.push({
                    name: 'depositProductDetail',
                    query: {
                        y_name: y_name
                    }
                })
            }

            onMounted(async () => {
                await store.dispatch('DepositProductList/fetchList')
            })

            return {
                DepositProductList,
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

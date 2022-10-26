<template>

    <div class="page-title">
        <div class="container clearfix">

            <div class="sixteen columns"> 
                <h1>고객센터</h1>
            </div>

            </div><!-- End Container -->
            </div><!-- End Page title -->

            <!-- Start main content -->
            <div class="container main-content clearfix">


            <!-- Start Sidebar Widgets -->
            <div class="five columns sidebar bottom-3">


            <!-- Categories Widget -->
            <div class="widget categories">
            <h3 class="title bottom-1">고객센터</h3><!-- Title Widget -->
            <ul class="arrow-list">
            <li><a href="notice.do">공지사항</a></li>
            <li><a href="faq.do">자주하는질문</a></li>
            <li><a href="cnsltInsert.do">상담신청</a></li>
            <li><a href="cnslt.do">상담내역</a></li>
            </ul><!-- End arrow-list -->
            </div>
            <!-- End -->

            <!-- Text Widget -->
            <div class="widget" style="margin-top:100px">
            <li style="text-indent: 1px;"><i class="icon-comments-alt s-20 color"></i>고객센터</li>
            <!-- Title Widget -->
            <p style="text-indent: 5px;">1588-1234</p>
            <p style="text-indent: 5px;">1599-1234</p>
            </div>
            <!-- End -->

            </div><!-- End Sidebar Widgets -->


            <!-- Start Posts -->
            <div class="sixteen columns bottom-3">

            <!-- ==================== Single Post ==================== -->
            <div class="post single style-1">

            <h3 class="title bottom-1" style="background:#f8f9fb;padding: 10px 20px 5px 20px; border-bottom: 1px solid #e1e1e1; border-top:1px solid #555;
            display: flex; justify-content: space-between;">
            제목 {{data.n_title}}<br>
            <span style="font-size:13px;">조회수 {{data.n_readCnt}}&nbsp;&nbsp;&nbsp;&nbsp;작성일 {{data.n_regDate}}</span>
            </h3><!-- Title Post -->
            <hr >
            <div class="post-content" style="padding: 10px 5px 40px 5px;">
            <p v-html="data.n_content"></p>

            </div><!-- End post-content -->
            <div  style=" display: flex; justify-content: center; margin-top:20px;">
            <input type="button" style="color:#ffffff;" value="목록" class="button1 small color" @click="moveRouter">
            </div>
            </div> 
            <!-- ==================== End Single Post  ==================== -->

        </div><!-- End Posts -->  

        <div class="clearfix"></div>

    </div><!-- <<< End Container >>> -->

</template>


<script>
import { useRouter, useRoute } from 'vue-router'
import { onMounted, onUnmounted, computed } from 'vue'
import { useStore } from 'vuex'

export default {
    name: 'noticeDetail',
    setup() {
        
        const router = useRouter()
        const route = useRoute()
        const store = useStore()

        const data = computed(() => {
            return store.state.noticeDetail.noticeDetail
        })

        const moveRouter = () => {
            router.push({
                name: 'noticeList'
            })
        }
        
        onMounted(async () => {
            await store.dispatch('noticeDetail/fetchDetail', route.query.n_No)
            console.log('onMounted data', data.value)
        })

        onUnmounted(() => {
            store.commit('noticeDetail/clearProductDetail')
        })

        return {
            data,
            moveRouter,
        }
    }
}
</script>
<style>
.title {
    text-align: left;
}
</style>
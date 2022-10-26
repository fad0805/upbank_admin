<template>
    
    <div class="page-title">
        <div class="container clearfix">

            <div class="sixteen columns">
                <h1>고객센터</h1>
            </div>

        </div>
        <!-- End Container -->
    </div>
    <!-- End Page title -->

    <!-- Start main content -->
		<div class="container main-content clearfix">


<!-- Start Sidebar Widgets -->
<div class="five columns sidebar bottom-3">


    <!-- Categories Widget -->
    <div class="widget categories">
        <h3 class="title bottom-1">고객센터</h3>
        <!-- Title Widget -->
        <ul class="arrow-list">
            <li><a href="http://localhost/upbank/notice.do">공지사항</a></li>
            <li><a href="http://localhost/upbank/faq.do">자주하는질문</a></li>
            <li><a href="http://localhost/upbank/cnsltInsert.do">상담신청</a></li>
            <li><a href="http://localhost/upbank//cnslt.do">상담내역</a></li>
        </ul>
        <!-- End arrow-list -->
    </div>
    <!-- End -->

    <!-- Text Widget -->
    <div class="widget" style="margin-top: 100px">
        <li style="text-indent: 1px;"><i
            class="icon-comments-alt s-20 color"></i>고객센터</li>
        <!-- Title Widget -->
        <p style="text-indent: 5px;">1588-1234</p>
        <p style="text-indent: 5px;">1599-1234</p>
    </div>
    <!-- End -->



</div>
<!-- End Sidebar Widgets -->


<!-- Start Posts -->
<div class="sixteen columns bottom-3">

    <!-- ==================== Single Post ==================== -->
    <div class="post single style-1">
    <form method="post" class="form-elements" id="insertForm" name="insertForm" action="${path}/noticeInsertAction.do">
         <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
        <div>
            <h3 class="title bottom-1">공지사항</h3>

            <hr class="line bottom-3" />

            <table class="table table-hover">
                <thead style="background:#378ac4; color:#fff; font-weight:bold;">
                    <tr>
                        <th scope="col" width="10%;">no</th>
                        <th scope="col" width="70%;">제목</th>
                        <th scope="col" width="10%;">조회수</th>
                        <th scope="col" width="10%;">작성일</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="notice in noticeList" v-bind:key="notice.n_No">
                        <th scope="row">{{notice.n_No}}</th>
                        <td @click="moveDetail(notice.n_No)">
                        {{notice.n_title}}
                        </td>
                        <td>{{notice.n_readcnt}}</td>
                        <td>{{notice.n_regdate}}</td>
                    </tr>
                </tbody>
            </table>
            <c:if test="${sessionScope.customerID == 'admin'}">
            <div  style=" display: flex; justify-content: center; margin-top:20px; margin-bottom:20px;">
              <a href="http://localhost/upbank/noticeInsert.do" class="button1 small color">글쓰기</a>
            </div>
            </c:if>
        </div>
        </form>
    </div>
    <!-- ==================== End Single Post  ==================== -->



</div>
<!-- End Posts -->

<div class="clearfix"></div>

</div>
<!-- <<< End Container >>> -->
</template>


<script>
    import { useRouter } from 'vue-router'
    import { useStore } from 'vuex'
    import { computed, onMounted } from 'vue'

    export default {
        name: 'noticeList',
        components: {
        },
        setup() {
            const router = useRouter()
            const store  = useStore()

            const noticeList = computed(() => {
                return store.state.noticeList.noticeList
            })

            const moveDetail = (n_No) => {
                router.push({
                    name: 'noticeDetail',
                    query: {
                        n_No: n_No
                    }
                })
            }

            onMounted(async () => {
                await store.dispatch('noticeList/fetchList')
            })

            return {
                noticeList,
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
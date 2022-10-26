<template>
    <div class="widget categories">
        <h3 class="title bottom-1">상품/가입</h3>
        <!-- Title Widget -->
        <ul class="arrow-list">
            <li><a href="http://localhost/upbank/depositAdd.do">예금상품추가</a></li>
            <li><a href="http://localhost/upbank/depositEdit.do">예금상품관리</a></li>
            <li><a href="http://localhost/upbank/inssvnAdd.do">적금상품추가</a></li>
            <li><a href="http://localhost/upbank/inssvnEdit.do">적금상품관리</a></li>
            <li><a href="http://localhost/upbank/depositList.do">메인</a></li>
        </ul>
        <!-- End arrow-list -->
    </div>
</template>
<script>
export default {
    setup() {

    },
}
</script>
<style>
    h3 {
        text-align: left;
    }
    li {
        text-align: left;
        left : -30px;
        font-size: 14px;
    }
    
    .arrow-list a {
        color : rgba(0, 0, 0, 0.63);
    }
</style>
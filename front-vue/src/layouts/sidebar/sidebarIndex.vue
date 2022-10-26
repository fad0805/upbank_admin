<template>
     <!-- Categories Widget -->
     <div class="widget categories">
       <h3 class="title bottom-1">대출</h3><!-- Title Widget -->
       <ul class="arrow-list">
         <li><a href="/loan_product.lo">대출 상품 조회</a></li>
         <li><a href="http://localhost/upbank/loan_product_add.lo">대출 상품 등록</a></li>
         <li><a href="http://localhost/upbank/admin_loan_join.lo">대출 신청 조회</a></li>
       </ul><!-- End arrow-list -->
     </div>
     <!-- End -->
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
<template>
    <header>
        <div class="top-bar">
        <div class="container clearfix common">
            <div class="slidedown">
            
            <div class="eight columns">
            <div class="phone-mail">
                <a><i class="icon-phone"></i> Phone : +22 665 450 210</a>
                <a href="info@website.com"><i class="icon-envelope-alt"></i> Mail : info@website.com</a>
            </div><!-- End phone-mail -->
            </div>
            <div class="eight columns">
            <div class="social">
            <a href="http://localhost/upbank/admin.ad">홈으로</a>
            <a href="#">인증센터</a>
            <a href="http://localhost/upbank/admin.ad" style="color:lightblue; font-weight:bold;">admin 홈으로 이동</a>
            <a href="http://localhost/upbank/logout.do">로그아웃</a>
            </div>
            </div><!-- End social-icons -->
            
            </div><!-- End slidedown -->
        </div><!-- End Container -->
        
        </div><!-- End top-bar -->
        
        <div class="main-header">
        <div class="container clearfix common">
            <a href="#" class="down-button"><i class="icon-angle-down"></i></a><!-- this appear on small devices -->
            <div class="one-third column">
            <div class="logo">
            <a href="admin.ad">
                <img src="@/resources/images/logo.png" alt="Upbank - 당신의 지갑을 UpBank" style="height:50px" /> 관리자 PAGE
            </a>
            </div>
            </div><!-- End Logo -->
            
            <div class="two-thirds column">
            <nav id="menu" class="navigation" role="navigation">
            <a href="#">Show navigation</a><!-- this appear on small devices -->
            <ul id="nav">
                <li><a href="http://localhost/upbank/adminSearchAccount.ad">조회</a>
                    <ul>
                        <li><a href="http://localhost/upbank/adminSearchAccount.ad">계좌조회</a></li>
                        <li><a href="http://localhost/upbank/adminChangeAccount.ad">계좌상태변경</a></li>
                        <li><a href="#">전체계좌조회</a></li>
                    </ul>
                </li>
                <li><a href="http://localhost/upbank/admin.ad">이체</a>
                    <ul>
                        <li><a href="http://localhost/upbank/admin.ad">이체결과조회</a></li>
                        <li><a href="http://localhost/upbank/admin.ad">자동이체결과조회</a></li>
                    </ul>
                </li>
                <li><a href="#2">금융상품</a>
                    <ul>
                        <li><a href="depositProductList.do">예금</a>
                            <ul>
                                <li><a href="http://localhost/upbank/depositMain.do">예금메인</a></li>
                                <li><a href="depositProductList.do">예금상품조회</a></li>
                                
                            </ul>
                        </li>
                        <li><a href="/loan_product.lo">대출</a>
                            <ul>
                                <li><a href="/loan_product.lo">대출 상품 조회</a></li>
                                <li><a href="http://localhost/upbank/loan_product_add.lo">대출 상품 등록</a></li>
                            </ul>
                        </li>
                        <li><a href="http://localhost/upbank/etf.do">펀드</a>
                            <ul>
                                <li><a href="http://localhost/upbank/etfDetail.do">ETF</a></li>
                                <li><a href="http://localhost/upbank/etn.do">ETN</a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li><a href="http://localhost/upbank/CurrencyExchangeAdmin.ad">외환</a>
                <ul>
                    <li><a href="http://localhost/upbank/CurrencyExchangeAdmin.ad">환전수령여부변경</a></li>
                </ul>
                </li>
                <li><a href="noticeList.ad">고객센터</a>
                <ul>
                    <li><a href="http://localhost/upbank/notice.do">고객센터메인</a></li>
                    <li><a href="http://localhost/upbank/blog_2.html">자주하는질문</a></li>
                    <li><a href="http://localhost/upbank/blog_3.html">상담신청</a></li>
                    <li><a href="http://localhost/upbank/blog_3_filter.html">상담내역</a></li>
                </ul>
                </li>
            </ul>
            </nav>
            </div><!-- End Menu -->
        
        </div><!-- End Container -->
        </div><!-- End main-header -->
    </header>
</template>
<script>
export default {
    setup() {

    },
}
</script>
<style>
.common {
    width: 990px;
    display: flex;
}
.phone-mail {
    display: flex;
    justify-content: flex-start;
}
.common  {
    display: flex;
    justify-content: center;
}
#nav ul {
    top: 110px;
    visibility: visible;
    left: 0px;
    width: 160px;
    display: none;
}
#nav li ul{
    display: none;
    top: 0px;
    visibility: visible;
}
#nav li:hover ul {
    top: 110px;
    visibility: visible;
    left: 0px;
    width: 160px;
    display: block;
}
#nav li:hover ul li {
    z-index: 97;
}
#nav li:hover ul li ul {
    display: none;
}
#nav li:hover ul li:hover ul {
    top: 0px;
    visibility: visible;
    left: 190px;
    width: 160px;
    display: block;
}
</style>
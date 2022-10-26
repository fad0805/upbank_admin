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
            <Sidebar />
        </div><!-- End Sidebar Widgets -->

        <!-- Start Posts -->
        <div class="sixteen columns bottom-3">

        <!-- ==================== Single Post ==================== -->
            <div class="post single style-1">
                <h3 class="title bottom-1">상품&가입</h3><!-- Title Post -->
            <hr class="line bottom-3" />

                <div class="services style-2 bottom-3" style="padding: 0 0 0 20px;">
                    <h5 class="title bottom-2" style="margin-bottom: 0 !important;"> {{ data.loan_summary }}</h5>
                    <h3 class="title bottom-2" style="padding: 0 5px 5px 5px;"> {{ data.loan_name }}</h3>
                    <br><br><br>
                    <div class="one-third column" style="width:280px; margin: 0 0 20px 0;">
                        <div class="item active bottom-3">
                            <div class="circle float-left" style="height:50px; background-color:#378ac4;"><i class="icon-calendar"></i></div>
                            <div class="data float-right">
                                <h5>기간</h5>
                                <h4>
                                    <strong v-if="data.loan_period >= 12">최장 {{ data.loan_period / 12 }} 년</strong>
                                    <strong v-else-if="data.loan_period < 12">최장 {{ data.loan_period }} 개월</strong>
                                </h4>
                            </div>
                        </div>
                    </div><!-- End item -->

                <div class="one-third column" style="width:280px; margin: 0 50px 20px 0;">
                <div class="item active bottom-3">
                    <div class="circle float-left" style="height:50px; background-color:#378ac4;"><i class="icon-ok"></i></div>
                    <div class="data float-right">
                        <h5>상환 방법</h5>
                        <h4><strong> {{ data.loan_repay }}</strong></h4>
                    </div>
                </div>
                </div><!-- End item -->

                <div class="one-third column" style="width:280px; margin: 0 0 20px 0;">
                    <div class="item active bottom-3">
                        <div class="circle float-left" style="height:50px; background-color:#e7402f;"><i class="icon-thumbs-up"></i></div>
                        <div class="data float-right">
                            <h5>최고</h5>
                            <h4>
                            <!-- 천만원 이상 -->
                            <strong v-if="data.loan_limit >= 10000000">{{ data.loan_limit/10000000 }} 천만원</strong>
                            <!-- 백만원 이상 -->
                            <strong v-else-if="data.loan_limit >= 1000000">{{ data.loan_limit/1000000 }} 백만원</strong>
                            <!-- 십만원 이상 -->
                            <strong v-else-if="data.loan_limit >= 100000">{{ data.loan_limit/100000 }} 십만원</strong>
                            <!-- 만원 이상 -->
                            <strong v-else>{{ data.loan_limit/10000 }} 만원</strong>
                            </h4>
                        </div>
                    </div>
                </div><!-- End item -->
            </div>
            <hr class="line bottom-3"/>

            <!-- 대출 내용 본문 시작 -->
            <div id="horizontal-tabs">
                <ul class="tabs">
                    <li id="tab1" @click="showMenu1">상품안내</li>
                    <li id="tab2" @click="showMenu2">금리 및 이율</li>
                    <li id="tab3" @click="showMenu3">이용 안내</li>
                    <li id="tab4" @click="showMenu4">유의사항 및 기타</li>
                </ul>
                <div class="contents">

                <div id="content1" class="tabscontent" v-if="show1">
                    <div style="padding: 1em; width:98%; border-top:1px solid #bdbdbd; display:flex; margin:0 auto;">
                    <p style="color:#378ac4; width:15%;"><strong>대출 한도</strong></p>
                    <p style="padding: 0 0 0 1em;">
                    <ul style="padding:0 0 0 2em;">
                        <li style="list-style-type: circle; margin:5px;">
                            최대 
                            <span v-if="data.loan_limit >= 100000000">{{ data.loan_limit/100000000 }}억원</span><!-- 일억원 이상 -->
                            <span v-else-if="data.loan_limit >= 10000000">{{ data.loan_limit/10000000 }}천만원</span><!-- 천만원 이상 -->
                            <span v-else-if="data.loan_limit >= 1000000">{{ data.loan_limit/1000000 }}백만원</span><!-- 백만원 이상 -->
                            <span v-else-if="data.loan_limit >= 100000">{{ data.loan_limit/100000 }}십만원</span><!-- 십만원 이상 -->
                            <span v-else>{{ data.loan_limit/10000 }}만원</span><!-- 만원 이상 -->
                        </li>
                    </ul>
                    </p>
                    </div>
                    <div style="padding: 1em; width:98%; border-top:1px solid #bdbdbd; display:flex; margin:0 auto;">
                        <p style="color:#378ac4; width:15%;"><strong>대출기간 및 상환방법</strong></p>
                        <p style="padding:0 0 0 1em;">
                            <ul style="padding:0 0 0 2em;">
                                <li style="list-style-type: circle; margin:5px;">
                                    대출 기간 : 최장
                                    <span v-if="data.loan_period >= 12">{{ data.loan_period/12 }} 년</span>
                                    <span v-else>{{ data.loan_period }} 개월</span>
                                    이내
                                </li>
                                <li style="list-style-type: circle; margin:5px;">
                                상환 방식 : {{ data.loan_repay }}
                                </li>
                            </ul>
                        </p>
                    </div>
                    <div style="padding: 1em; width:98%; border-top:1px solid #bdbdbd; border-bottom:1px solid #bdbdbd; display:flex; margin:0 auto;">
                        <p style="color:#378ac4; width:15%;"><strong>원리금상환방법</strong></p>
                        <p style="padding: 0 0 0 1em;">
                            <ul style="padding:0 0 0 2em;">
                                <li style="list-style-type: circle; margin:5px;">
                                    원금은 약정된 분할상환납입일에 균등분할상환하고, 이자는 원금상환방법과 동일한 월단위로 후취
                                </li>
                            </ul>
                        </p>
                    </div>
                </div> 
                <div id="content2" class="tabscontent"  v-if="show2">
                    <div style="padding: 1em; width:97%; border-top:1px solid #bdbdbd; 
                        display:flex; align-items:center; justify-content:center; margin:0 auto;">
                        <p style="color:#378ac4; width:15%;"><strong>대출금리</strong></p>
                        <div style="padding: 0 0 0 1em; width:85%; display:block;">
                            <table class="style color" style="width:100%;">
                                <tr>
                                    <th>금리구분</th>
                                    <th>금리변동주기</th>
                                    <th>기본금리</th>
                                    <th>가산금리</th>
                                    <th>우대금리</th>
                                </tr>
                                <tr v-for="rate in data.rate" v-bind:key="rate.loan_rate">
                                    <td>{{ rate.rate_name }}</td>
                                    <td>{{ rate.rate_change }}개월</td>
                                    <td>{{ rate.rate_basemoney }}</td>
                                    <td v-if="rate.rate_spread != 0">{{ rate.rate_spread }}</td>
                                    <td v-if="rate.rate_prime != 0">{{ rate.rate_prime }}</td>
                                </tr>
                            </table>
                            <ul style="padding:0 0 0 2em;">
                                <li style="list-style-type: circle; margin:5px;">
                                {{ data.loan_rate_summary }}
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div style="padding: 1em; width:97%; border-top:1px solid #bdbdbd;
                    display:flex; align-items:center; justify-content:center; margin:0 auto;">
                        <p style="color:#378ac4; width:15%;"><strong>중도상환수수료</strong></p>
                        <div style="padding: 0 0 0 1em; width:85%; display:block;">
                            <ul style="padding:0 0 0 2em;">
                                <li style="list-style-type: circle; margin:5px;">
                                중도상환해약금 : 중도상환대출금액 X 중도상환해약금율* X 대출잔여일수 ÷ 대출기간<br>
                                ※ 최초 대출일로부터 3년(기한연장 포함)까지 적용합니다.<br>
                                ※ 대출잔여기간 3개월 이내 상환 시 면제<br><br>

                                중도상환해약금율 : {{ data.loan_termination_fee }}%
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div style="padding: 1em; width:97%; border-top:1px solid #bdbdbd;
                    display:flex; align-items:center; justify-content:center; margin:0 auto;">
                        <p style="color:#378ac4; width:15%;"><strong>대출계약철회권</strong></p>
                        <div style="padding: 0 0 0 1em; width:85%; display:block;">
                            <ul style="padding:0 0 0 2em;">
                                <li style="list-style-type: circle; margin:5px;">
                                계약서류 수령일, 계약 체결일, 대출금 수령일 중 나중에 발생한 날부터 14일(기간의 말일이 휴일인 경우 다음 영업일)까지 은행에 서면, 전화, 컴퓨터 통신으로 철회의사를 표시하고 원금, 이자 및 부대비용을 전액 반환한 경우 대출계약을 철회할 수 있습니다.
                                </li>
                                <li style="list-style-type: circle; margin:5px;">
                                대출계약 철회권 남용 시 불이익 : 동일 은행에 최근 1개월 내에 2회 이상 대출계약을 철회하는 경우 해당 은행으로부터 신규대출·대출만기 연장 거절, 대출한도 축소, 금리우대 제한 등 불이익이 발생할 수 있습니다. 
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div style="padding: 1em; width:97%; border-top:1px solid #bdbdbd; border-bottom:1px solid #bdbdbd; 
                    display:flex; align-items:center; justify-content:center; margin:0 auto;">
                        <p style="color:#378ac4; width:15%;"><strong>위법계약해지권</strong></p>
                        <div style="padding: 0 0 0 1em; width:85%; display:block;">
                            <ul style="padding:0 0 0 2em;">
                                <li style="list-style-type: circle; margin:5px;">
                                은행이 「금융소비자 보호에 관한 법률」에서 정하는 적합성, 적정성 및 설명의무를 위반하였거나, 불공정거래행위 혹은 부당권유를 하여 대출계약을 체결한 경우, 법 위반사실을 안 날부터 1년 또는 계약서류 수령일·계약체결일·대출금 수령일로부터 5년 중 먼저 도달한 기간 이내에 서면, 전화, 컴퓨터 통신으로 해당 계약의 해지를 요구할 수 있습니다. 
                                </li>
                                <li style="list-style-type: circle; margin:5px;">
                                은행은 해지를 요구받은 날부터 10일 이내에 고객에게 수락여부 및 그 사유를 고객에게 통지합니다.
                                </li>
                            </ul>
                        </div>
                    </div>
                </div> 
            <div id="content3" class="tabscontent"  v-if="show3">
                <div style="padding: 1em; width:97%; border-top:1px solid #bdbdbd; 
                display:flex; align-items:center; justify-content:center; margin:0 auto;">
                    <p style="color:#378ac4; width:15%;"><strong>대출상환 관련 안내</strong></p>
                    <div style="padding: 0 0 0 1em; width:85%; display:block;">
                        <ul style="padding:0 0 0 2em;">
                            <li style="list-style-type: circle; margin:5px;">
                                이자 계산 방법 : 이자는 원금에 소정이자율과 기간을 곱한 후 약정이자율이 연리에 의한 경우 일 단위는 365(윤년은 366)로, 월 단위는 12로 나누어 계산합니다. 
                            </li>
                            <li style="list-style-type: circle; margin:5px;">
                                원금 및 이자의 상환시기<br>
                                ※ 아래의 내용은 상환방법에 대한 이해를 돕기 위한 내용으로 실제 대출상품별 선택 가능한 상환방법은 각 상품「상품안내」의 "대출기간 및 상환방법"을 확인하시기 바랍니다.<br>
                                (1) 일시상환대출 : 대출기간 중에는 이자지급일에 이자만 납부하고, 대출기간 만료일에 대출원금을 전액 상환합니다.<br>
                                (2) 원리금균등 분할상환 : 매월 이자지급일에 동일한 할부금을 상환합니다.<br>
                                (3) 원금균등 분할상환 : 매월 이자지급일에 이자 및 동일한 할부 원금을 상환합니다.<br>
                                (4) 할부금고정 분할상환 : 매월 이자지급일에 최초 할부금을 만기까지 상환하고, 잔액은 대출기간 만료일에 전액 상환합니다.<br>
                                (5) 혼합상환 : 고객님이 지정한 대출원금은 만기일에 일시 상환하고, 나머지 금액은 매월 이자지급일에 동일한 할부금으로 상환합니다.<br>
                                (6) 통장자동대출 : ‘매일의 잔액’에 대하여 하루단위로 이자를 계산하여 매월 이자납입일(은행이 정한 매월 결산일)에 대출금액에 합산합니다.<br>
                            </li>
                            <li style="list-style-type: circle; margin:5px;">
                                휴일 대출 상환 : 인터넷뱅킹을 통해 휴일에도 대출 원금 및 이자를 상환 할 수 있습니다.<br>
                                (단, 외부 기관 협약 대출 등 일부 상품은 제외되며 외부기관의 사정에 의해 거래가 제한될 수 있습니다.)<br>
                            </li>
                        </ul>
                    </div>
                </div>
                <div style="padding: 1em; width:97%; border-top:1px solid #bdbdbd; border-bottom:1px solid #bdbdbd; 
                display:flex; align-items:center; justify-content:center; margin:0 auto;">
                    <p style="color:#378ac4; width:15%;"><strong>기한연장 관련 안내</strong></p>
                    <div style="padding: 0 0 0 1em; width:85%; display:block;">
                        <ul style="padding:0 0 0 2em;">
                            <li style="list-style-type: circle; margin:5px;">
                                일시상환방식 대출의 기한연장은 대출만기일 1개월 이전부터 가능하며, 만기일 전까지 영업점을 방문하셔서 필요한 절차(기한연장, 재대출, 대출상환 등)를 진행하셔야 대출금에 대한 연체이자 발생 등 불이익이 발생하지 않습니다. 단, 은행이 정한 기준에 따라 자동기한연장 대상으로 선정 시 자동기한연장에 대해 동의하는 경우 자동기한연장 처리됩니다.<br>
                                자동기한연장의 동의는 인터넷뱅킹, 콜센터, 영업점을 통하여 등록 가능합니다.<br>
                                ※ 분할상환을 선택하는 경우 기한연장은 불가합니다.<br>
                            </li>
                        </ul>
                    </div>
                </div>
            </div> 
            <div id="content4" class="tabscontent"  v-if="show4">
                <div style="padding: 1em; width:97%; border-top:1px solid #bdbdbd;
                display:flex; align-items:center; justify-content:center; margin:0 auto;">
                    <p style="color:#378ac4; width:15%;"><strong>만기경과 후 기한의 이익 상실에 대한 안내</strong></p>
                    <div style="padding: 0 0 0 1em; width:85%; display:block;">
                        <ul style="padding:0 0 0 2em;">
                            <li style="list-style-type: circle; margin:5px;">
                                만기일 경과 후 대출금액을 전액 상환하지 않거나 기한 연장하지 않은 경우, 은행여신거래기본약관에 따라 기한의 이익이 상실되어 대출잔액에 대한 지연배상금이 부과됨. 
                            </li>
                            <li style="list-style-type: circle; margin:5px;">
                                연체가 계속되는 경우, 연체기간에 따라 『신용정보의 이용 및 보호에 관한 법률』과 『일반신용정보 관리규약』에 따라 "연체정보 등"으로 등록되어 금융 불이익을 받을 수 있음. 
                            </li>
                        </ul>
                    </div>
                </div>
                <div style="padding: 1em; width:97%; border-top:1px solid #bdbdbd; border-bottom:1px solid #bdbdbd; 
                display:flex; align-items:center; justify-content:center; margin:0 auto;">
                    <p style="color:#378ac4; width:15%;"><strong>고객께서 알아두셔야 할 사항</strong></p>
                    <div style="padding: 0 0 0 1em; width:85%; display:block;">
                        <ul style="padding:0 0 0 2em;">
                            <li style="list-style-type: circle; margin:5px;">
                                일반금융소비자는 은행이 계약 체결을 권유하는 경우 및 일반금융소비자가 설명을 요청하는 경우에도 중요한 사항을 이해할 수 있도록 설명받을 권리가 있습니다.
                            </li>
                            <li style="list-style-type: circle; margin:5px;">
                                대출신청인이 신용도판단정보 등록자(신용회복지원 또는 배드뱅크 포함)이거나 은행의 신용평가 결과 신용등급이 낮은 고객일 경우 대출이 제한될 수 있습니다.
                            </li>
                            <li style="list-style-type: circle; margin:5px;">
                                상환능력에 비해 대출금, 신용카드 사용액이 과도할 경우 개인신용평점 하락할 수 있으며, 개인신용평점 하락으로 금융거래와 관련된 불이익이 발생할 수 있습니다. 또한 대출 취급 후 일정 기간 납부해야 할 원리금이 연체될 경우, 계약만료 기한이 도래하기 전에 모든 원리금을 변제해야 할 의무가 발생할 수 있습니다. 
                            </li>
                            <li style="list-style-type: circle; margin:5px;">
                                금리재산정주기 도래 또는 기한연장 시 거래실적에 따른 우대금리 조건 충족여부, 신용등급 변화 등에 따라 금리가 변동될 수 있습니다.
                            </li>
                            <li style="list-style-type: circle; margin:5px;">
                                대출 사실만으로 신용점수는 하락할 수 있습니다.
                            </li>
                            <li style="list-style-type: circle; margin:5px;">
                                본 공시는 상품에 대한 이해를 돕고 약관의 중요내용을 알려드리기 위한 참고자료이며, 실제상품의 계약은 대출거래약정서, 여신거래기본약관 등의 적용을 받기 때문에 대출계약을 체결하기 전에 반드시 상품설명서 및 관련 약관을 읽어보시기 바랍니다.
                            </li>
                        </ul>
                    </div>
                </div>
            </div>  

            </div><!-- End contents -->

                <div style="display:flex; justify-content:center; align-items:center; padding: 30px 0;">
                    <a href="/loan_product.lo" id="product_list" class="button1 small normal">목록</a>
                </div>
            </div><!-- 대출 내용 본문 끝 -->

            </div><!-- End post-content -->
        </div> 
    <!-- ==================== End Single Post  ==================== -->
    </div><!-- End container -->  
</template>

<script>
import Sidebar from '../layouts/sidebar/sidebarIndex.vue'

import { useRouter, useRoute } from 'vue-router'
import { onMounted, onUnmounted, computed } from 'vue'
import { useStore } from 'vuex'

export default {
    name: 'loan_product_detail',
    data () {
        return {
            show1 : true,
            show2 : false,
            show3 : false,
            show4 : false,
        }
    },
    methods: {
        showMenu1() {
            this.show1 = true
            this.show2 = false
            this.show3 = false
            this.show4 = false
            console.log(this.show1, this.show2, this.show3, this.show3)
        },
        showMenu2() {
            this.show1 = false
            this.show2 = true
            this.show3 = false
            this.show4 = false
            console.log(this.show1, this.show2, this.show3, this.show3)
        },
        showMenu3() {
            this.show1 = false
            this.show2 = false
            this.show3 = true
            this.show4 = false
            console.log(this.show1, this.show2, this.show3, this.show3)
        },
        showMenu4() {
            this.show1 = false
            this.show2 = false
            this.show3 = false
            this.show4 = true
            console.log(this.show1, this.show2, this.show3, this.show3)
        }
    },
    components: {
        Sidebar,
    },
    setup() {
        
        const router = useRouter()
        const route = useRoute()
        const store = useStore()

        const data = computed(() => {
            return store.state.productDetail.productDetail
        })

        const moveRouter = () => {
            router.push({
                name: 'loan_product'
            })
        }
        
        onMounted(async () => {
            await store.dispatch('productDetail/fetchDetail', route.query.loan_num)
            console.log('onMounted data', data.value)
        })

        onUnmounted(() => {
            store.commit('productDetail/clearProductDetail')
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
.click_menu {
    display: block;
}
#horizontal-tabs .tabscontent {
    display: block;
    width:100%;
    padding: 1em;
}
</style>
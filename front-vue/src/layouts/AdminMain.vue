<template>
    <div id="wrap" class="boxed">
        <Header />
        <Content />
        <Footer />
    </div>
</template>

<script>
import Content from './content/contentIndex.vue'
import Footer from './footer/footerIndex.vue'
import Header from './header/headerIndex.vue'

export default {
    components: {
        Content,
        Footer,
        Header
    },
    setup() {
    },
}
</script>
<style>
</style>
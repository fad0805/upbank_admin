<template>
  <Main />
</template>

<script>
import Main from './layouts/AdminMain.vue'

export default {
  name: 'App',
  components: {
    Main
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#app a {
  text-decoration: none;
}

@import './resources/css/style.css';
@import './resources/css/skins/colors/blue.css';
@import './resources/css/layout/wide.css';
@import './resources/css/switcher/style.css';
</style>
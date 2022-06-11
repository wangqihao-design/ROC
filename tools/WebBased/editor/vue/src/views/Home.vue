<template>
  <!--
  <div id="nav">
    <router-link to="/">Home</router-link> |
    <router-link to="/about">About</router-link>
  </div>
  <router-view/>
  -->
  <Header />
  <Body />
</template>

<script>
// @ is an alias to /src

import Body from "/src/components/Body"
import Header from "/src/components/Header";


export default {
  name: 'Home',
  components: {
    Header,
    Body}
}
</script>

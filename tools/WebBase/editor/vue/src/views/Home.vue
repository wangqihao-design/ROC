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

  <!-- 可尝试一个页面上多个模型： -->
  <!-- <live2d
    :model="[1, 53]"
    :direction="direction"
    :width="width"
    :height="height"
    customId="vue-live2d-mian-2"
  ></live2d> -->
  <live2d
      :style="style"
      :model="[1, 53]"
      :direction="direction"
      :size="size"
  ></live2d>
</template>

<script>
// @ is an alias to /src

import live2d from 'vue-live2d/src/index.vue'
import Body from "/src/components/Body"
import Header from "/src/components/Header";


export default {
  name: 'Home',
  components: {
    Header,
    Body,
    live2d},
  data () {
    return {
      direction: 'right',
      style: 'position: fixed; bottom: 0; left: 0; zIndex: 1',
      width: 500,
      height: 500,
      size: 350,
      tips: {
        mouseover: [{
          selector: '.vue-live2d',
          texts: ['这样可以修改默认语句']
        }]
      }
    }
  },
  created () {
    // tips 未使用，可自行在组件绑定此参数，注意此参数只会初始化一次
    this.tips = this.customTips
  }
}
</script>

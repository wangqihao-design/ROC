<template>
  <div class="Intro">
    <h1 style="font-size: 90px" @click="Home"> Constellation Editor </h1>
    <p m="t-2" style="font-size: 30px;"> A Heart of Iron Mod Editor for everyone </p>
  </div>
  <img src="@/assets/icon.png" width="200" height="200" border="0" alt="">

  <div class="download">
    <div class="Header" style="height: 50px; line-height: 50px; border-bottom: 1px solid #CCC">
    <h3> 开始制作！ </h3>
    </div>
    <div style="padding-top: 20px">
    <el-button type="primary" round style="height: 50px; width: 150px" disabled>下载桌面版</el-button>
    <el-button type="success" round style="height: 50px; width: 150px" @click="WebBased">在线开始</el-button>
      <router-view></router-view>
    </div>
  </div>
</template>

<style>

</style>

<script>
export default {
  name: "Body",
  components: {},
  data() {
    return ;
  },
  methods:{
    WebBased() {
      this.$router.push("/func");
    },
    Home(){
      this.$router.push("./")
    }
  }
}

</script>

<style scoped>

</style>
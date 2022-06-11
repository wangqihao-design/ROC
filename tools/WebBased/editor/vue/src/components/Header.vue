<template>
  <div class="Header" style="height: 50px; line-height: 50px; border-bottom: 1px solid #CCC;display: flex">
    <div style="padding-left: 2px"><img src="@/assets/icon.png" width="50" height="50"/></div>
    <div style="width: 200px; font-weight: bold;color: dodgerblue; padding-left: 1px">Constellation Editor</div>
    <div style="flex: 1"></div>
    <div style="width: 200px; padding-top: 17px">
      <el-dropdown>
    <span class="el-dropdown-link">
      Dropdown List
      <el-icon class="el-icon--right">
        <arrow-down />
      </el-icon>
    </span>
        <template #dropdown>
          <el-dropdown-menu>
            <el-dropdown-item>Contact us</el-dropdown-item>
            <el-dropdown-item>Nothing</el-dropdown-item>
            <el-dropdown-item>Nothing</el-dropdown-item>
          </el-dropdown-menu>
        </template>
      </el-dropdown>
    </div>
  </div>
</template>

<script>
export default {
  name: "Header"
}
</script>

<style scoped>

</style>
<template>
  <div style="height: 50px; line-height: 50px; border-bottom: 1px solid #CCC;display: flex">
    <div style="width: 100px; font-weight: bold;color: dodgerblue; padding-left: 30px">Editor</div>
    <div style="flex: 1"></div>
    <div style="width: 200px; padding-top: 17px">
      <el-dropdown>
          <span class="el-dropdown-link">
            Dropdown List<el-icon class="el-icon--right"><arrow-down /></el-icon>
          </span>
        <template #dropdown>
          <el-dropdown-menu>
            <el-dropdown-item>Action 1</el-dropdown-item>
            <el-dropdown-item>Action 2</el-dropdown-item>
            <el-dropdown-item>Action 3</el-dropdown-item>
            <el-dropdown-item>Action 4</el-dropdown-item>
            <el-dropdown-item>Action 5</el-dropdown-item>
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


<style>

</style>
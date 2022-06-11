<template>
  <el-form ref="form" :model="sizeForm" label-width="80px" size="mini">
    <el-form-item label="MOD名称">
      <el-input v-model="sizeForm.name"></el-input>
    </el-form-item>
    <el-form-item label="MOD标签">
      <el-select v-model="sizeForm.region" placeholder="请选择标签">
        <el-option label="War" value="shanghai"></el-option>
        <el-option label="Tech" value="beijing"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="MOD介绍" prop="desc">
      <el-input type="textarea"></el-input>
    </el-form-item>
    <el-form-item size="large">
      <el-button type="primary" @click="onSubmit">立即创建</el-button>
      <el-button>取消</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  name: "Form",
  data() {
    return {
      sizeForm: {
      name: '',
      region: '',
      date1: '',
      date2: '',
      delivery: false,
      type: [],
      resource: '',
      desc: ''
    }
  };
},
  methods: {
  onSubmit() {
  console.log('submit!');
}
}
};
</script>

<style scoped>

</style>
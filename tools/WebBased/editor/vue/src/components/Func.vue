<template>
  <div>
  <el-container>
    <el-aside width="250px">
      <el-menu
          style="width: 250px;min-height: calc(100vh - 50px)"
          default-active="2"
          class="el-menu-vertical-demo"
          @open="handleOpen"
          @close="handleClose"
      >
        <el-menu-item index="1" disabled>
          <el-icon><Folder /></el-icon>
          <span>编辑海军</span>
        </el-menu-item>
        <el-menu-item index="2" disabled>
          <el-icon><Folder /></el-icon>
          <span>编辑陆军与空军</span>
        </el-menu-item>
        <el-menu-item index="3" disabled>
          <el-icon><Folder /></el-icon>
          <span>创建地区</span>
        </el-menu-item>
        <el-menu-item index="4" disabled>
          <el-icon><Folder /></el-icon>
          <span>创建国策树</span>
        </el-menu-item>
        <el-menu-item index="5" disabled>
          <el-icon><Folder /></el-icon>
          <span>创建国家</span>
        </el-menu-item>
        <el-menu-item index="6" disabled>
          <el-icon><Folder /></el-icon>
          <span>创建剧本</span>
        </el-menu-item>
        <el-menu-item index="7" disabled>
          <el-icon><Folder /></el-icon>
          <span>创建决议</span>
        </el-menu-item>
        <el-menu-item index="8" disabled>
          <el-icon><Folder /></el-icon>
          <span>创建民族精神</span>
        </el-menu-item>
        <el-menu-item index="9" disabled>
          <el-icon><Folder /></el-icon>
          <span>创建事件</span>
        </el-menu-item>
        <el-menu-item index="10" disabled>
          <el-icon><Folder /></el-icon>
          <span>创建意识形态</span>
        </el-menu-item>
        <el-menu-item index="11" disabled>
          <el-icon><Folder /></el-icon>
          <span>添加顾问</span>
        </el-menu-item>
        <el-menu-item index="12" disabled>
          <el-icon><Folder /></el-icon>
          <span>添加建筑</span>
        </el-menu-item>
        <el-menu-item index="13" disabled>
          <el-icon><Setting /></el-icon>
          <span>更多功能？下载桌面版</span>
        </el-menu-item>

      </el-menu>
    </el-aside>
    <el-main>
      <el-alert
          title="请上传 或者 使用模板"
          type="info"
          center
          show-icon>
      </el-alert>

      <el-tabs v-model="activeName" @tab-click="handleClick">
        <el-tab-pane label="上传" name="first">
          <el-upload
              class="upload-demo"
              drag
              action="https://jsonplaceholder.typicode.com/posts/"
              multiple>
            <i class="el-icon-upload"></i>
            <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em></div>
            <div class="el-upload__tip" slot="tip">只能上传jpg/png文件，且不超过500kb</div>

          </el-upload>
        </el-tab-pane>
        <el-tab-pane label="使用模板" name="second">
          <Form />
        </el-tab-pane>
        <Describe />
      </el-tabs>



    </el-main>
  </el-container>
  </div>
</template>

<script>
import { Location, Folder, Setting } from '@element-plus/icons';
import Form from "/src/components/Form"
import Describe from "/src/components/Describe"


export default {
  name: "Func",
  components : {
    Location,
    Folder,
    Setting,
    Form,
    Describe
  },
  methods: {
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClick(tab, event) {
      console.log(tab, event);
    },

    data() {
      return {
        activeName: 'second'
      };
    }
  }
}
</script>

<style scoped>

</style>
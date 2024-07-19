<template>
  <div id="app">
    <h1>{{ str.data }}</h1>
  </div>
</template>

<script>
  import axios from "axios"
  export default {
    name: "App",
    data() {
      return {
        str: {}
      }
    },
    mounted() {
      this.temp()
    },
    methods: {
      temp() {
        axios
          .get("http://localhost:8080/test")
          .then(response => {
            this.str = response.data
          })
          .catch(err => {
            console.log(err)
          })
      }
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
    margin-top: 60px;
  }
</style>

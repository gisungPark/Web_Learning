const express = require("express")
const morgan = require("morgan")
const cookieParser = require("cookie-parser")
const session = require("express-session")
const cors = require("cors")
const app = express()

app.set("port", process.env.PORT || 8080)

app.use(morgan("dev"))

app.use(cors())

app.get("/test", (req, res) => {
  sendData = {
    data: "호텔3 데이터 test"
  }
})

/* 서버와 포트 연결.. */
app.listen(app.get("port"), () => {
  console.log(app.get("port"), "번 포트에서 서버 실행 중 ..")
})

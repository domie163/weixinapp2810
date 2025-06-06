const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmo387b/",
            name: "ssmo387b",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmo387b/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "医院挂号系统小程序"
        } 
    }
}
export default base

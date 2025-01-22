const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmn412p/",
            name: "ssmn412p",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmn412p/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园疫情防控系统"
        } 
    }
}
export default base

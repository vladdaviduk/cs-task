class TextService{

    constructor($http){
        this.$http = $http;
    }

    sendText (text) {
        return this.$http.post("/analyzer", {text: text});
    }
}

module.exports = TextService;

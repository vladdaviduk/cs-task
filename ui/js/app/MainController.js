class MainController{

    constructor($scope, service){
        this.$scope = $scope;
        this.service = service;
    }

    $onInit() {
        this.$scope.submit = () => {
            this.service.sendText(this.$scope.form.text).then((response) => {
                this.$scope.uniqueWords = response.data;
            }, (reason) => {
                this._showMsg(reason);
                console.log(reason);
            });
        };
    }

    _showMsg(value) {
        if (value.data.hasOwnProperty('message'))
            alert(value.data.message);

    }
}

module.exports = MainController;
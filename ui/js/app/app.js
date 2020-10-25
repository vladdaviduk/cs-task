import '../../css/app.css';

import angular from './angular-index';
import controller from './MainController';
import service from './TextService';

let app = angular.module('demo', []);

app.service('TextService', ["$http", service]);
app.controller('controller', ["$scope", "TextService", controller]);

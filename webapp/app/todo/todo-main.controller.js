'use strict';

angular.module('app', ['ngRoute'])

    .config(function ($routeProvider) {
    .
        when('/', {
            redirectTo: 'app/index.html',
            controller: 'TodoController'
        })
            .when('/todo-main', {
                redirectT
            })
            .otherwise()
    })

    .controller('TodoController', ['$scope', function ($scope) {
        $scope.name = 'dario';
    }]);
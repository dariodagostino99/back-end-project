'use strict';


angular.module('app.todo')

.config(function ($stateProvider) {
    $stateProvider.state('todo-main', {
        url: '/todo-main',
        views: {
            controller: 'TodoController',
            controllerAs: 'ctrl',
            template: 'app/todo/todo-main.html'
        },
        resolve: {}
    })

})

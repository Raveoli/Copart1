/**
 * Created by raveenahegde on 04/04/17.
 */
/*
* JS Library/framework* based - Nested ListView (Simple) (10 points)

 The Problem:

 JS based ListView - Must have multiple Nested list views - (eg) Countries, States, Cities.

 Single JSON response vs Multiple JSON response - Showcase both.
 Reuse components and reuse data from cache/store [*] - Use React or AngularJS or ember or backbone or one of the modern JS frameworks/libraries. Do not use JQuery or ExtJS
* */

var app = angular.module('nestedView', []);


app.controller ('listController', function ($scope, lists) {
    $scope.list  = lists;
   // console.log("lists"+JSON.stringify(lists));
    $scope.show = false;

    $scope.expand = function() {
        //console.log("show")
        $scope.show = true;
    }
});

app.factory('lists', [function() {
    var list = [
        {
            countries: 'India',
            states: 'Karnataka',
            cities: 'Bangalore',
        },
        {
            countries: 'USA',
            states: 'Texas',
            cities: 'Dallas',
        },
        {
            countries: 'USA',
            states: 'California',
            cities: 'LA',
        },
        {
            countries: 'USA',
            states: 'New York',
            cities: 'New York',
        }
    ];

    return list;


}]);
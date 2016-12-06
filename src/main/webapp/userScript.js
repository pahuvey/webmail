var myApp = angular.module("myApp" , ["ngRoute"]);

myApp.config(function($routeProvider){
	$routeProvider
	.when('/home', {templateUrl:'home.html'})
	.when('/formulaire', {templateUrl:'formulaire.html'});
	

	
	});



myApp.controller("myCtrl", function($scope, $http) {
    init($scope, $http);
    $scope.user = {}
    $scope.remove = function(id) {
        deleteUser(id,$http,$scope);
    }

    $scope.show = function(id) {
        getUser(id, $scope, $http);
    }

    $scope.addUser = function() {
        saveUser($scope,$http);
    }	
    $scope.date = new Date();
	
	$scope.edit=function(id){
		editUser1(id, $http, $scope);
	}
		

});
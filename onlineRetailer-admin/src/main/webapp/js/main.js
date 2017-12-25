var app = angular.module('mainpage', []);
app.controller('mainpageCtrl', function($scope, $http) {
	$scope.querryByinput = function() {
		alert("========"+($scope.searchCondition).trim());
	};
	$scope.showFlag = false;
	$scope.display = function() {
		$scope.showFlag = !$scope.showFlag;
	};
});
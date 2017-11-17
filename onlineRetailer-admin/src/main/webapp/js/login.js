var app = angular.module('onlineLogin', []);
app.controller('loginCtrl', function($scope, $http) {
	$scope.login = function() {
		$http({
			method: 'POST',
		    url: '/onlineRetailer-admin/onlineRetailer/login.action',
		    data: {name:$scope.name,password:$scope.password}
		}).then(function successCallback(response) {
			}, function errorCallback(response) {
		});
	}
});
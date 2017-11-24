var app = angular.module('onlineLogin', []);
app.controller('loginCtrl', function($scope, $http) {
	$scope.login = function() {
		$http({
			method: 'POST',
		    url: '/onlineRetailer-admin/onlineRetailer/login.action',
		    data: {
					name: $scope.name,
					password: $scope.password,
					id: "111",
					email: "18351451741@163.com",
					phone: "18351451741",
					address: "kunming"
			}
		}).then(function successCallback(response) {
			}, function errorCallback(response) {
		});
	}
});
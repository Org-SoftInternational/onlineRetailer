var app = angular.module('onlineLogin', []);
app.controller('loginCtrl', function($scope, $http) {
	$scope.register = function() {
		$http({
			method: 'POST',
		    url: '/onlineRetailer-admin/onlineRetailer/register.action',
		    data: {
					name: $scope.name,
					password: $scope.password,
					email: $scope.email,
					phone: $scope.phone,
					address: $scope.address
			}
		}).then(function successCallback(response) {
			}, function errorCallback(response) {
		});
	}
});
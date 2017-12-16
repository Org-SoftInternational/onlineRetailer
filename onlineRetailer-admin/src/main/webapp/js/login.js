
var myApp=angular.module('myApp',[]);
myApp.controller('loginController',function($scope, $http){
    $scope.submitForm=function () {
		$http({
					method: 'POST',
				    url: '/onlineRetailer-admin/onlineRetailer/login.action',
				    data: {
							name: $scope.username,
							password: $scope.password						
					}
				}).then(function successCallback(response) {
					if(response.data.returnCode=="200"){
						alert("登录成功！");			
					}else{
						alert("登录失败");

					}					
					}, function errorCallback(response) {
				});
			}
		});


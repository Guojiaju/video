(function() {
  'use strict';
  /**
   * Created by Administrator on 2016/3/22.
   * auth:xzc
   */
  angular
    .module('frontTvWeb')
    .service('LoginService',LoginService);

  /** @ngInject */
  function LoginService($q,$http){
    var loginService = [];

    loginService.createAccount = function(user){
      return $http({
        method:'POST',
        url:'http://localhost:8080/end_tv_web/userAction/insertUser',
        data:user
      });
    }

    loginService.loginFront = function(user){
      return $http({
        method:'POST',
        url:'http://localhost:8080/end_tv_web/userAction/loginFront',
        data:user
      });
    }

    return loginService;
  }
})();


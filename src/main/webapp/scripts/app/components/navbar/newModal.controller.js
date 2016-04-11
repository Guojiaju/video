(function() {
  'use strict';

  angular
    .module('frontTvWeb')
    .controller('NewModalController',NewModalController);

  /** @ngInject */
  function NewModalController($modalInstance,$log,LoginService) {
    var vm = this;
    vm.ok = function(){
      LoginService.loginFront(vm.user).then(function(result){
        vm.data = result.data.data;
        console.log(vm.data);
        $modalInstance.close(vm.data);
      },function(err){
        $log.error(err.status +":"+ err.statusText);
      })

    }
    vm.cancel =function(){
      $modalInstance.dismiss('cancel');
    }
  } //End of MainController

  angular
    .module('frontTvWeb')
    .controller('createAccountController',createAccountController);

  /** @ngInject */
  function createAccountController($modalInstance,$log,LoginService) {
    var vm = this;
    vm.ok = function(){
      LoginService.createAccount(vm.user).then(function(result){
        vm.code = result.data.code;
        if(vm.code == 0){
          $modalInstance.close();
        }
      },function(err){
        $log.error(err.status + ':'+err.statusText);
      });

    }
    vm.cancel =function(){
      $modalInstance.dismiss('cancel');
    }
  } //End of MainController
})();

(function() {
  'use strict';

  angular
    .module('frontTvWeb')
    .controller('TeachSortController',TeachSortController);

  /** @ngInject */
  function TeachSortController( TeachSortService, $log) {
    var vm = this;
    TeachSortService.getTeaches().then(function(result){
      vm.teaches = result.data;
    },function(err){
      $log.error(err.status +":"+err.statusText);
    });
    TeachSortService.getMenu().then(function(result){
      vm.menus = result.data;
    },function(err){
      $log.error(err.status +":"+err.statusText);
    })
  } //End of MainController

})();

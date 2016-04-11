(function() {
  'use strict';

  angular
    .module('frontTvWeb')
    .controller('FitnessSortController',FitnessSortController);

  /** @ngInject */
  function FitnessSortController( FitnessSortService, $log) {
    var vm = this;
    FitnessSortService.getFitnesses().then(function(result){
      vm.fitnesses = result.data;
    },function(err){
      $log.error(err.status +":"+err.statusText);
    });
    FitnessSortService.getMenu().then(function(result){
      vm.menus = result.data;
    },function(err){
      $log.error(err.status +":"+err.statusText);
    })
  } //End of MainController

})();

(function() {
  'use strict';

  angular
    .module('frontTvWeb')
    .controller('TvSortController',TvSortController);

  /** @ngInject */
  function TvSortController( $modal, TvSortService, $log) {
    var vm = this;
    TvSortService.getTvs().then(function(result){
      vm.tvs = result.data;
    },function(err){
      $log.error(err.status +":"+err.statusText);
    });
    TvSortService.getMenus().then(function(result){
      vm.menus = result.data;
    },function(err){
      $log.error(err.status +":"+err.statusText);
    });
  } //End of MainController

})();

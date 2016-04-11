(function() {
  'use strict';

  angular
    .module('frontTvWeb')
    .controller('ArtsSortController',ArtsSortController);

  /** @ngInject */
  function ArtsSortController( ArtsSortService, $log) {
    var vm = this;
    ArtsSortService.getArts().then(function(result){
      vm.arts = result.data;
    },function(err){
      $log.error(err.status +":"+err.statusText);
    });
    ArtsSortService.getMenu().then(function(result){
      vm.menus = result.data;
    },function(err){
      $log.error(err.status +":"+err.statusText);
    })
  } //End of MainController

})();

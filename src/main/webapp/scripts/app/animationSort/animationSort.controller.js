(function() {
  'use strict';

  angular
    .module('frontTvWeb')
    .controller('AnimationSortController',AnimationSortController);

  /** @ngInject */
  function AnimationSortController( AnimationSortService, $log) {
    var vm = this;
    AnimationSortService.getAnimations().then(function(result){
      vm.animations = result.data;
    },function(err){
      $log.error(err.status +":"+err.statusText);
    });
    AnimationSortService.getMenu().then(function(result){
      vm.menus = result.data;
    },function(err){
      $log.error(err.status +":"+err.statusText);
    })
  } //End of MainController

})();

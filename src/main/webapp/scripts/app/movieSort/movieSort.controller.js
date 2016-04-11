(function() {
  'use strict';

  angular
    .module('frontTvWeb')
    .controller('MovieSortController',MovieSortController);

  /** @ngInject */
  function MovieSortController( MovieSortService, $log) {
    var vm = this;
    MovieSortService.getMovies().then(function(result){
      vm.movies = result.data;
    },function(err){
      $log.error(err.status +":"+err.statusText);
    });
    MovieSortService.getMenu().then(function(result){
      vm.menus = result.data;
    },function(err){
      $log.error(err.status +":"+err.statusText);
    })
  } //End of MainController

})();

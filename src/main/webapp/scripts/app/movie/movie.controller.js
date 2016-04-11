(function() {
  'use strict';

  angular
    .module('frontTvWeb')
    .controller('MovieController',MovieController);

  /** @ngInject */
  function MovieController( $modal, MovieService, TvService, $log) {
    var vm = this;
    vm.loveData = {
      'type':'likeMovie',
      'number':9
    };
    vm.movieData = {
      'type':'movie',
      'number':5
    };

    MovieService.getMovies(vm.movieData).then(function(result){
     vm.movies = result.data.data;
    },function(err){
      $log.error(err.statusText +':'+ err.status);
    });

    TvService.getLove(vm.loveData).then(function(result){
      vm.tvDatas = result.data.data;
    },function(err){
      $log.error(err.status + ':' +err.statusText);
    });

  } //End of MainController

})();

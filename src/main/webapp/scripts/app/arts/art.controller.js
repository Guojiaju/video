(function() {
  'use strict';

  angular
    .module('frontTvWeb')
    .controller('ArtController',ArtController);

  /** @ngInject */
  function ArtController( $modal, ArtService,$log) {
    var vm = this;

    vm.artCarousel = {
      'type':'artCarousel',
      'number':5
    };
    vm.artData = {
      'type':'art',
      'number':9
    };
    vm.artNewData = {
      'type':'art',
      'number':12
    };
    /*爱情剧*/
    ArtService.getArts(vm.artCarousel).then(function(result){
      vm.lgArts = result.data.data;
    },function(err){
      $log.error(err.status + ':' +err.statusText);
    });
    ArtService.getShows(vm.artData).then(function(result){
      vm.artShows = result.data.data;
    },function(err){
      $log.error(err.status + ':'+err.statusText);
    })
    ArtService.getNews(vm.artNewData).then(function(result){
      vm.artNews = result.data.data;
    },function(err){
      $log.error(err.status + ':'+err.statusText);
    })
  } //End of MainController

})();

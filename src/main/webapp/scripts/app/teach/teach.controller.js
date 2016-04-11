(function() {
  'use strict';

  angular
    .module('frontTvWeb')
    .controller('TeachController',TeachController);

  /** @ngInject */
  function TeachController( $modal, TeachService, $log) {
    var vm = this;

    vm.likeData ={
      'type':'teach',
      'number':6
    };
    vm.educationData = {
      'type':'teach',
      'number':9
    };
    vm.liveData = {
      'type':'teach',
      'number':12
    };
    /*可能喜欢*/
    TeachService.getLikes(vm.likeData).then(function(result){
      vm.guesses = result.data.data;
    },function(err){
      $log.error(err.status + ':'+err.statusText);
    });

    /*中小学教育*/
    TeachService.getEducations(vm.educationData).then(function(result){
      vm.educations = result.data.data;
    },function(err){
      $log.error(err.status + ':'+err.statusText);
    });

    /**/
    TeachService.getLives(vm.liveData).then(function(result){
      vm.lives = result.data.data;
    },function(err){
      $log.error(err.status + ':'+err.statusText);
    });

  } //End of MainController

})();

(function() {
  'use strict';

  angular
    .module('frontTvWeb')
    .controller('FitnessController',FitnessController);

  /** @ngInject */
  function FitnessController( $modal, FitnessService, $log) {
    var vm = this;

    vm.fitnessCarousel = {
      'type':'fitnessCarousel',
      'number':7
    };
    vm.healthData = {
      'type': 'fitness',
      'number':9
    };
    vm.educationData = {
      'type': 'fitness',
      'number':6
    };
    vm.medicalData = {
      'type':'fitness',
      'number':9
    };
    FitnessService.getCarouse(vm.fitnessCarousel).then(function(result){
     vm.slides = result.data.data;
    },function(err){
      $log.error(err.statusText +':'+ err.status);
    });

    FitnessService.getHealth(vm.healthData).then(function(result){
      vm.health_message = result.data.data;
    },function(err){
      $log.error(err.statusText+':'+err.status);
    });

    FitnessService.getEducation(vm.educationData).then(function(result){
      vm.educations = result.data.data;
    },function(err){
      $log.error(err.statusText+':'+err.status);
    });

    FitnessService.getMedical(vm.medicalData).then(function(result){
      vm.medicals = result.data.data;
    },function(err){
      $log.error(err.statusText+':'+err.status);
    });

  } //End of MainController

})();

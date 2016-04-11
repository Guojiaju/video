(function() {
  'use strict';
  /**
   * Created by Administrator on 2016/3/22.
   * auth:xzc
   */
  angular
    .module('frontTvWeb')
    .service('FitnessService',FitnessService);

  /** @ngInject */
  function FitnessService($q,$http){
    var fitnessService = [];

    fitnessService.getCarouse = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
      /*var d = $q.defer();
      d.resolve({'data':slides});
      return d.promise;*/
    };
    fitnessService.getHealth = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
    };
    fitnessService.getEducation = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
    };
    fitnessService.getMedical = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
    };
    return fitnessService;
  }
})();


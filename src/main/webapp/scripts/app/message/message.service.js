(function() {
  'use strict';
  /**
   * Created by Administrator on 2016/3/22.
   * auth:xzc
   */
  angular
    .module('frontTvWeb')
    .service('MessageService',MessageService);

  /** @ngInject */
  function MessageService($q,$http){
    var messageService = [];

    teachService.getLikes = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
    };

    return teachService;
  }
})();


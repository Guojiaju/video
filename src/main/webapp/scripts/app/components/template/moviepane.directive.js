(function() {
  'use strict';
  /**
   * Created by Administrator on 2016/3/23.
   * auth: xzc
   * 未经允许请勿转载
   */
  angular
    .module('frontTvWeb')
    .directive('moviePane', moviePane);

  /** @ngInject */
  function moviePane() {
    var directive = {
      restrict: 'EA',
      templateUrl: 'app/components/template/moviepane.html',
      scope:{
        movieDatas:'='
      }
    };

    return directive;

  }

})();

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cmsbackoffice2viewer;

import com.mycompany.cmsbackoffice2domain.News;
import java.beans.IntrospectionException;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

/**
 *
 * @author Geertjan
 */
public class NewsChildFactory extends ChildFactory<News> {

    @Override
    protected boolean createKeys(List<News> list) {
        list.add(new News("French riots", "Story about riots in France", "var bidsData = new Array();\n"
                + "var finalChartData = new Array();\n"
                + "\n"
                + "/**\n"
                + " * Generates list of products.\n"
                + " * @returns {Element} div for holding all products\n"
                + " */\n"
                + "var generateProductList = function() {\n"
                + "    return $('<div/>', {class: 'productList'});\n"
                + "};\n"
                + "\n"
                + "/**\n"
                + " * Generates one product from given data.\n"
                + " * @param {Object} element product object (id, description, endPrice, image, name, sold, startPrice, ...)\n"
                + " * @returns {Element} created element\n"
                + " */\n"
                + "var generateProduct = function(element) {\n"
                + "    // product wrapper\n"
                + "    productWrapper = $('<span/>', {class: 'productWrapper'});\n"
                + "\n"
                + "    // append bids label to the product\n"
                + "    productWrapper.append($('<div/>', {class: 'bids', title: 'Bids', text: bidsData[element.id]}));\n"
                + "\n"
                + "    // product image\n"
                + "    img = $('<img/>', {src: element.image, alt: element.name, title: element.name});\n"
                + "    image = $('<div/>', {class: 'image'}).append(img);\n"
                + "    productWrapper.append(image);\n"
                + "\n"
                + "    // product name\n"
                + "    productWrapper.append('<span class=\"name\">' + element.name + '</span>');\n"
                + "\n"
                + "    // product price\n"
                + "    priceWrapper = $('<div/>');\n"
                + "    priceWrapper.append($('<span/>', {class: 'from', text: 'From '}));\n"
                + "    priceWrapper.append($('<span/>', {class: 'price'}).html(\"$\" + addCommas(element.startPrice.toFixed(2))));\n"
                + "    productWrapper.append(priceWrapper);\n"
                + "\n"
                + "    return productWrapper;\n"
                + "};\n"
                + "\n"
                + "/**\n"
                + " * Generates DIV element with clears unfinished floats.\n"
                + " * @returns {Element} created clearer div element\n"
                + " */\n"
                + "var generateClearer = function() {\n"
                + "    return $('<div/>', {class: 'clear'});\n"
                + "};\n"
                + "\n"
                + "/**\n"
                + " * Parses data from JSON and returns them processed for chart needs.\n"
                + " * @param {JSON} data\n"
                + " * @returns {Array} processed data for chart\n"
                + " */\n"
                + "var parseChartData = function(data) {\n"
                + "    var chartData = new Array();\n"
                + "    $.each(data, function(index, element) {\n"
                + "        if (chartData[element.auction.id] === undefined) {\n"
                + "            // not initialized object yet, initialize\n"
                + "            chartData[element.auction.id] = {\n"
                + "                label: element.auction.name,\n"
                + "                data: new Array(new Array(element.auction.id, 1))\n"
                + "            };\n"
                + "            bidsData[element.auction.id] = 1;\n"
                + "        } else {\n"
                + "            // just increase the usage counter\n"
                + "            rowData = chartData[element.auction.id].data;\n"
                + "            rowData[0][1] += 1;\n"
                + "            bidsData[element.auction.id] += 1;\n"
                + "        }\n"
                + "    });\n"
                + "\n"
                + "    // sort the array by popularity\n"
                + "    chartData = chartData.sort(function(a, b) {\n"
                + "        return b.data[0][1] - a.data[0][1];\n"
                + "    });\n"
                + "\n"
                + "    // create usual array starting from index 0\n"
                + "    var i = 0;\n"
                + "    for (var row in chartData) {\n"
                + "        chartData[row].data[0][0] = i;\n"
                + "        finalChartData[i++] = chartData[row];\n"
                + "    }\n"
                + "\n"
                + "    finalChartData = finalChartData.splice(0, 5);\n"
                + "};\n"
                + "\n"
                + "/**\n"
                + " * Draws chart into the #placeholder place.\n"
                + " * @param {Array} chartData\n"
                + " */\n"
                + "var drawChart = function(placeholder) {\n"
                + "    if ($(placeholder).css(\"visibility\") === \"visible\") {\n"
                + "        updateSizes(true, placeholder);\n"
                + "        // draw chart\n"
                + "        $.plot(placeholder, finalChartData, {\n"
                + "            xaxis: {\n"
                + "                show: false\n"
                + "            },\n"
                + "            series: {\n"
                + "                bars: {show: true, barWidth: 0.6}\n"
                + "            }\n"
                + "        });\n"
                + "    } else {\n"
                + "        updateSizes(false, placeholder);\n"
                + "        // delete available content\n"
                + "        $(placeholder).empty();\n"
                + "    }\n"
                + "};\n"
                + "\n"
                + "/**\n"
                + " * Resize event method for refreshing drawed chart.\n"
                + " */\n"
                + "$(window).resize(function() {\n"
                + "    if (jQuery.browser.msie) {\n"
                + "        if (parseFloat(jQuery.browser.version) < 8) {\n"
                + "            return;\n"
                + "        }\n"
                + "    }\n"
                + "    drawChart('#chart_placeholder');\n"
                + "});\n"
                + "\n"
                + "var updateSizes = function(largeOne, placeholder) {\n"
                + "    if (largeOne) {\n"
                + "        // update placeholder size\n"
                + "        $(placeholder).css(\"width\", \"250px\").css(\"height\", \"375px\").css(\"margin\", \"30px\");\n"
                + "    } else {\n"
                + "        // update placeholder size\n"
                + "        $(placeholder).css(\"width\", \"0px\").css(\"height\", \"0px\").css(\"margin\", \"0px\");\n"
                + "    }\n"
                + "};\n"
                + ""));
        list.add(new News("Greek demonstrations", "Interviews with Greeks", "var JsonLocation = {\n"
                + "    auctions : \"data/Auction.json\",\n"
                + "    bids : \"data/Bid.json\"\n"
                + "};\n"
                + ""));
        list.add(new News("Strikes in Belgium", "Discussion on Belgian problems", "function addCommas(nStr) {\n"
                + "    nStr += '';\n"
                + "    x = nStr.split('.');\n"
                + "    x1 = x[0];\n"
                + "    x2 = x.length > 1 ? '.' + x[1] : '';\n"
                + "    var rgx = /(\\d+)(\\d{3})/;\n"
                + "    while (rgx.test(x1)) {\n"
                + "        x1 = x1.replace(rgx, '$1' + ',' + '$2');\n"
                + "    }\n"
                + "    return x1 + x2;\n"
                + "}\n"
                + ""));
        return true;
    }

    @Override
    protected Node createNodeForKey(News t) {
        NewsNode node = null;
        try {
            node = new NewsNode(t);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return node;
    }
    
}

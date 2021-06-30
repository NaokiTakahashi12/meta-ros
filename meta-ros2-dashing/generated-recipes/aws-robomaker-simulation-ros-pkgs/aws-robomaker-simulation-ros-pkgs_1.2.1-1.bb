# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "AWS RoboMaker package for accessing the simulation service."
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "aws-robomaker-simulation-ros-pkgs"
ROS_BPN = "aws_robomaker_simulation_ros_pkgs"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/aws-gbp/aws_robomaker_simulation_ros_pkgs-release/archive/release/dashing/aws_robomaker_simulation_ros_pkgs/1.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/aws_robomaker_simulation_ros_pkgs"
SRC_URI = "git://github.com/aws-gbp/aws_robomaker_simulation_ros_pkgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "250987c42f592bc71081e2af2a1b945a0baacd09"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}